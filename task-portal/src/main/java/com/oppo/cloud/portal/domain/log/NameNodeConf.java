/*
 * Copyright 2023 OPPO.
 *
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

package com.oppo.cloud.portal.domain.log;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("name node 集群配置信息")
public class NameNodeConf {

    @ApiModelProperty("命名空间")
    private String nameservices;

    @ApiModelProperty("namenode地址")
    private String[] namenodesAddr;

    @ApiModelProperty("namenode名称")
    private String[] namenodes;

    @ApiModelProperty("操作用户")
    private String user;
}
