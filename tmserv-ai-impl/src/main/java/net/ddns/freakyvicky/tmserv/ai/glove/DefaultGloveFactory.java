package net.ddns.freakyvicky.tmserv.ai.glove;

import net.ddns.freakyvicky.tmserv.ai.GloveFactory;
import net.ddns.freakyvicky.tmserv.util.ConfigurationService;
import net.ddns.freakyvicky.tmserv.util.Property;
import net.ddns.freakyvicky.tmserv.util.model.Sample;
import org.deeplearning4j.models.glove.Glove;
import org.deeplearning4j.text.sentenceiterator.CollectionSentenceIterator;
import org.deeplearning4j.text.sentenceiterator.SentenceIterator;
import org.deeplearning4j.text.tokenization.tokenizer.preprocessor.CommonPreprocessor;
import org.deeplearning4j.text.tokenization.tokenizerfactory.DefaultTokenizerFactory;
import org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class DefaultGloveFactory implements GloveFactory {

    private static final String SENTENCE_SPLIT = "\\.";

    @Resource
    private ConfigurationService configurationService;

    public DefaultGloveFactory(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @Cacheable("gloves")
    public GloveWrapper getFittedGlove(Sample sample) {

        TokenizerFactory tokenizerFactory = new DefaultTokenizerFactory();
        tokenizerFactory.setTokenPreProcessor(new CommonPreprocessor());

        SentenceIterator iterator = new CollectionSentenceIterator(
                Arrays.stream(sample.getText().split(SENTENCE_SPLIT))
                        .map(String::strip)
                        .collect(Collectors.toList()));

        Glove glove = new Glove.Builder()

                .iterate(iterator)
                .tokenizerFactory(tokenizerFactory)
                .alpha(configurationService.getDouble(Property.ALPHA))
                .learningRate(configurationService.getDouble(Property.LEARNING_RATE))
                .epochs(configurationService.getInteger(Property.EPOCHS))
                .xMax(configurationService.getDouble(Property.XMAX))
                .batchSize(configurationService.getInteger(Property.BATCH_SIZE))
                .shuffle(configurationService.getBoolean(Property.SHUFFLE))
                .symmetric(configurationService.getBoolean(Property.SYMMETRIC))
                .build();

        glove.fit();

        GloveWrapper gloveWrapper = new GloveWrapper(glove, sample.getReference());

        return gloveWrapper;
    }

}
