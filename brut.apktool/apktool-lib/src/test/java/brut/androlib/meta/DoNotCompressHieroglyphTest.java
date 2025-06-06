/*
 *  Copyright (C) 2010 Ryszard Wiśniewski <brut.alll@gmail.com>
 *  Copyright (C) 2010 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.androlib.meta;

import brut.androlib.BaseTest;
import brut.common.BrutException;

import org.junit.*;
import static org.junit.Assert.*;

public class DoNotCompressHieroglyphTest extends BaseTest {

    @Test
    public void testHieroglyph() throws BrutException {
        ApkInfo apkInfo = ApkInfo.load(getClass().getResourceAsStream("/meta/donotcompress_with_hieroglyph.yml"));
        assertEquals("2.0.0", apkInfo.getVersion());
        assertEquals("testapp.apk", apkInfo.getApkFileName());
        assertEquals(2, apkInfo.getDoNotCompress().size());
        assertEquals("assets/AllAssetBundles/Andriod/tx_1001_冰原1", apkInfo.getDoNotCompress().get(0));
        assertEquals("assets/AllAssetBundles/Andriod/tx_1001_冰原1.manifest", apkInfo.getDoNotCompress().get(1));
    }
}
