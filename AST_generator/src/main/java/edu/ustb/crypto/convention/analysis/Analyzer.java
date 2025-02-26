package edu.ustb.crypto.convention.analysis;

import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;

/**
 * @auther lwj
 * @date 2025/2/26 21:29
 */
public class Analyzer {

    /**
     * 加载映射文件
     *
     * @param contract
     * @param convention
     * @param mapping_file_path
     * @return
     * @throws Exception
     */
    public static Contract start(Contract contract, Convention convention, String mapping_file_path) throws Exception {
        // the final contract
        Contract res = new Contract();
        res = contract;

        // load mapping file to memory


        // load contract infos to memory


        // check bind

        // check clause


        return res;
    }
}
