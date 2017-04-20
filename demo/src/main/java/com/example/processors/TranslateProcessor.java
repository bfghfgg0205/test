package com.example.processors;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

import com.example.services.TranslateService;

public class TranslateProcessor extends AbstractAttributeTagProcessor {

	private TranslateService service;

	public TranslateProcessor(String dialectPrefix, TranslateService service) {
		super(TemplateMode.HTML, dialectPrefix, null, false, "trans", true, 10000, true);
		this.service = service;
	}

	@Override
	protected void doProcess(ITemplateContext arg0, IProcessableElementTag arg1, AttributeName arg2, String arg3,
			IElementTagStructureHandler arg4) {
		arg4.setBody(service.convertLocale(arg3), false);

	}

}
