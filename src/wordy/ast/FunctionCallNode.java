package wordy.ast;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

import wordy.interpreter.EvaluationContext;

public class FunctionCallNode extends ExpressionNode {
    private final String name;

    public FunctionCallNode(String name) {
        this.name = name;
    }

    @Override
    protected double doEvaluate(EvaluationContext context) {
        context.call(name).call();
        return 0;
    }

    @Override
    public Map<String, ASTNode> getChildren() {
        return Collections.emptyMap();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        FunctionCallNode that = (FunctionCallNode) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    
}
