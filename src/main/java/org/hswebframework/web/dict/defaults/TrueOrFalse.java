package ddxq.mobi.web.dict.defaults;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ddxq.mobi.web.dict.EnumDict;

@Getter
@AllArgsConstructor
public enum TrueOrFalse implements EnumDict<Byte> {
    
    TRUE((byte) 1, "是"),

    FALSE((byte) 0, "否");

    private Byte value;

    private String text;

}
