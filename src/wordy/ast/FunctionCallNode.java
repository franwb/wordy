package wordy.ast;

import java.util.Map;

import wordy.interpreter.EvaluationContext;

public class FunctionCallNode extends ExpressionNode {
    private final String name;

    public FunctionCallNode(String name) {
        this.name = name;
    }

    @Override
    protected double doEvaluate(EvaluationContext context) {
        // TODO Auto-generated method stub
        context.call(name);
        throw new UnsupportedOperationException("Unimplemented method 'doEvaluate'");
    }

    @Override
    public Map<String, ASTNode> getChildren() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChildren'");
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hashCode'");
    }
    
}
