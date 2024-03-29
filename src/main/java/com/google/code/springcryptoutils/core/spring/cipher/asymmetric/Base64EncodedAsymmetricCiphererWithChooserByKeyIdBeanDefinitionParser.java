package com.google.code.springcryptoutils.core.spring.cipher.asymmetric;

import com.google.code.springcryptoutils.core.cipher.asymmetric.Base64EncodedCiphererWithChooserByKeyIdImpl;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class Base64EncodedAsymmetricCiphererWithChooserByKeyIdBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return Base64EncodedCiphererWithChooserByKeyIdImpl.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        bean.addPropertyValue("algorithm", element.getAttribute("algorithm"));
        bean.addPropertyValue("mode", element.getAttribute("mode"));
        bean.addPropertyValue("charsetName", element.getAttribute("charset"));
        bean.addPropertyReference("keyMap", element.getAttribute("keyMap-ref"));
    }

}