package com.cargo.jpush.push.model.audience;

/**
 * @Auther: xinzs
 * @Date: 2020/10/22 14:41
 */
public enum AudienceType {
    TAG("tag"),
    TAG_AND("tag_and"),
    TAG_NOT("tag_not"),
    ALIAS("alias"),
    SEGMENT("segment"),
    ABTEST("abtest"),
    REGISTRATION_ID("registration_id"),
    FILE("file"),

            ;

    private final String value;

    private AudienceType(final String value) {
        this.value = value;
    }
    public String value() {
        return this.value;
    }

    public static AudienceType getType(String value) {
        for (AudienceType type: AudienceType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

}
