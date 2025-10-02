/**
 * @description:
 * @author: 29874
 * @date: 2025/10/2 21:14
 */

package com.yue.api;

import com.yue.api.response.Response;

public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);
}
