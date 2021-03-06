package cat.wars.cms.framework.domain.course.response;

import cat.wars.cms.framework.domain.course.ext.TeachPlanNode;
import cat.wars.cms.framework.model.response.ResponseResult;
import cat.wars.cms.framework.model.response.ResultCode;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: wars
 * Date: 4/8/19
 * Time: 9:29 PM
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TeachPlanResponse extends ResponseResult {

    public TeachPlanResponse(ResultCode resultCode, TeachPlanNode teachPlanNode) {
        super(resultCode);
        this.teachPlanNode = teachPlanNode;
    }

    private TeachPlanNode teachPlanNode;
}
