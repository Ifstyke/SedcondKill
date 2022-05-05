package com.ghw.secondkill.vo;

import com.ghw.secondkill.utils.ValidatorUtil;
import com.ghw.secondkill.validator.IsMobile;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/5 19:05
 * @Version
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;

    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (required){
            return ValidatorUtil.isMobile(s);
        } else {
            if (StringUtils.isEmpty(s)){
                return true;
            } else {
                return ValidatorUtil.isMobile(s);
            }
        }
    }
}
