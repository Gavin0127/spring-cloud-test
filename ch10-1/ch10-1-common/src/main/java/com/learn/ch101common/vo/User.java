package com.learn.ch101common.vo;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/22 10:38
 */
@Data
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    public static final String USER_ID = "customs_user_Id";

    private String userId;

    private String userName;

    public Map<String, String> getHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put(USER_ID, userId);
        return headers;
    }
}
