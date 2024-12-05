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
    private BlockNode body;
    private final String name;
    // In the WordyParser file, make a new rule to read function def and function call 
    // In the EvaluationContext file, make a map to store function name and the node 
    // In the FunctionCallNode file, get the function from the map

    public FunctionNode(String name, BlockNode body) {
        this.name = name;
        this.body = body;
    }    

    public void call() {
        body.run(functionContext);
    }

    @Override
    protected void doRun(EvaluationContext context) {
        context.define(name, this);
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
