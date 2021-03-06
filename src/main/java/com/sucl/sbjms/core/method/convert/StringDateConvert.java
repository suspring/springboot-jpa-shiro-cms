package com.sucl.sbjms.core.method.convert;

import com.sucl.sbjms.core.util.DateUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * demo
 * @author sucl
 * @date 2019/4/3
 */
@Component
public class StringDateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String source) {
        if(DateUtils.isDate(source)){
            return DateUtils.getDate(source);
        }
        return null;
    }
}
