/*
 * Created on 3 avr. 2014 ( Time 19:43:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */

package org.demo.validator;

import org.demo.bean.Country ;
import org.demo.common.MessagesKeys;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 * Validator for entity Country
 * 
 * @author Telosys Tools Generator
 *
 */
public class CountryValidator extends AbstractValidator<Country>{

    @Override
    public void validateEntity(Country entity, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "code", MessagesKeys.ID_MUST_DEFINE);


    }
}