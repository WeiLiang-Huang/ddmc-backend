package ddxq.mobi.web.bean;

@FunctionalInterface
public interface Converter {
    <T> T convert(Object source, Class<T> targetClass,Class[] genericType);
}
