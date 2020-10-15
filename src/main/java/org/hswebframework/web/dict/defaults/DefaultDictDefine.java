package ddxq.mobi.web.dict.defaults;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ddxq.mobi.web.dict.DictDefine;
import ddxq.mobi.web.dict.EnumDict;

import java.util.List;

/**
 * @author zhouhao
 * @since 3.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultDictDefine implements DictDefine {
    private static final long serialVersionUID = 20094004707177152L;
    private String           id;
    private String           alias;
    private String           comments;
    private String           parserId;
    private List<EnumDict<Object>> items;
}
