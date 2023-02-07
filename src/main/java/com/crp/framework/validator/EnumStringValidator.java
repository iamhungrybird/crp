package com.crp.framework.validator;

import com.crp.framework.annotation.EnumString;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc: 枚举校验器    EnumString 校验器的配置, 被校验的参数类型String
 * @Author 吴想想
 * @Date 2023/2/6
 */
public class EnumStringValidator implements ConstraintValidator<EnumString, String> {
    private List<String> enumStringList;

    @Override
    public void initialize(EnumString constraintAnnotation) {
        enumStringList = Arrays.asList(constraintAnnotation.value());
    }

    /**
     * @param value   被校验的参数
     * @param context 校验的约束
     * @return
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return enumStringList.contains(value);
    }
}
