package com.example.processors;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

import com.example.services.TranslateService;
import com.example.services.impl.TranslateServiceImpl;

public class TranslateProcessor extends AbstractAttributeTagProcessor {
	
	TranslateService service = new TranslateServiceImpl();

	public TranslateProcessor(String dialectPrefix) {
		super(TemplateMode.HTML, dialectPrefix, null, false, "trans", true, 10000, true);
	}

	@Override
	protected void doProcess(ITemplateContext arg0, IProcessableElementTag arg1, AttributeName arg2, String arg3,
			IElementTagStructureHandler arg4) {
		arg4.setBody(service.convertLocale(arg3), false);

	}

}
