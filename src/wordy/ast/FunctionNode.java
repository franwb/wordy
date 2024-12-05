package wordy.ast;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import wordy.interpreter.EvaluationContext;

public class FunctionNode extends StatementNode {

    private EvaluationContext functionContext = new EvaluationContext();
    // In the WordyParser file, make a new rule to read function def and function call 
    // In the EvaluationContext file, make a map to store function name and the node 
    // In the FunctionCallNode file, get the function from the map

    public FunctionNode() {

    }    

    @Override
    protected void doRun(EvaluationContext context) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doRun'");
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
