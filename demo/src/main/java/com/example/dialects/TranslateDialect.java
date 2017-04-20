package com.example.dialects;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;

import com.example.processors.TranslateProcessor;

@Component
public class TranslateDialect extends AbstractProcessorDialect  {

	public TranslateDialect() {
		super("Translate", "trans", 1000);
	}

	@Override
	public Set<IProcessor> getProcessors(final String arg0) {
		final Set<IProcessor> processors = new HashSet<IProcessor>();
        processors.add(new TranslateProcessor(arg0));
        return processors;
	}

	
}
