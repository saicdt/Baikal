/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.datatech.baikal.web.vo;

import java.io.Serializable;

public class ConfigVO implements Serializable {

    private Long table_version;
    private String source_instance;
    private String source_schema;
    private String source_table;
    private Long sofar;
    private Long total_work;
    private String meta_flag;

    public Long getTable_version() {
        return table_version;
    }

    public void setTable_version(Long table_version) {
        this.table_version = table_version;
    }

    public String getSource_instance() {
        return source_instance;
    }

    public void setSource_instance(String source_instance) {
        this.source_instance = source_instance;
    }

    public String getSource_schema() {
        return source_schema;
    }

    public void setSource_schema(String source_schema) {
        this.source_schema = source_schema;
    }

    public String getSource_table() {
        return source_table;
    }

    public void setSource_table(String source_table) {
        this.source_table = source_table;
    }

    public Long getSofar() {
        return sofar;
    }

    public void setSofar(Long sofar) {
        this.sofar = sofar;
    }

    public Long getTotal_work() {
        return total_work;
    }

    public void setTotal_work(Long total_work) {
        this.total_work = total_work;
    }

    public String getMeta_flag() {
        return meta_flag;
    }

    public void setMeta_flag(String meta_flag) {
        this.meta_flag = meta_flag;
    }
}
