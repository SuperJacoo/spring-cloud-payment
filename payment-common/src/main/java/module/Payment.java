package module;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gehuadong@shuidihuzhu.com
 * @date 2020-03-07 22:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;

    @TableLogic
    private Integer isDelete;

    private Date createTime;

    private Date updateTime;
}
