package ddxq.mobi.web.dict.apply;

import ddxq.mobi.web.dict.DictDefineRepository;

/**
 * @author zhouhao
 * @since 3.0
 */
public interface DictWrapper {
    DictWrapper empty = (bean, repository) -> {};

    void wrap(Object bean, DictDefineRepository repository);


}
