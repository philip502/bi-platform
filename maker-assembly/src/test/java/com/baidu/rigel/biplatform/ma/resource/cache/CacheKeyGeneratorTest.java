/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.rigel.biplatform.ma.resource.cache;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 *
 * @author wangyuxue
 * @version 1.0.0.1
 */
public class CacheKeyGeneratorTest {
    
    /**
     * 
     */
    @Test
    public void testGenerateJointedKey() {
        String key = CacheKeyGenerator.generateJointedKey();
        Assert.assertNotNull(key);
        key = CacheKeyGenerator.generateJointedKey("test");
        Assert.assertNotNull(key);
        Assert.assertEquals("test", key);
        key = CacheKeyGenerator.generateJointedKey(new String[]{"test", "test"});
        Assert.assertEquals("test_test", key);
    }
    
    /**
     * 
     */
    @Test
    public void testGenerateSessionReportKey() {
        String key = CacheKeyGenerator.generateSessionReportKey(null, null, null);
        Assert.assertNotNull(key);
        key = CacheKeyGenerator.generateSessionReportKey(null, "test", "test");
//        Assert.assertEquals("report_test_test", key);
    }
    
    /**
     * 
     */
    @Test
    public void testGenerateRuntimeReportKey() {
        String key = CacheKeyGenerator.generateRuntimeReportKey(null, null, null);
        Assert.assertNotNull(key);
        key = CacheKeyGenerator.generateRuntimeReportKey(null, "test", "test");
//        Assert.assertEquals("runtime_test_test", key);
    }
}
