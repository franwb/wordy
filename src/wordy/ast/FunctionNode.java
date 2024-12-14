package wordy.ast;

import static wordy.ast.Utils.orderedMap;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import wordy.interpreter.EvaluationContext;

public class FunctionNode extends StatementNode {

    private BlockNode body;
    private final String name;
    // In the WordyParser file, make a new rule to read function def and function call 
    // In the EvaluationContext file, make a map to store function name and the node 
    // In the FunctionCallNode file, get the function from the map

    public FunctionNode(String name, BlockNode body) {
        this.name = name;
        this.body = body;
    }  

    public void call(EvaluationContext context) {
        body.run(context);
    }

    @Override
    protected void doRun(EvaluationContext context) {
        context.define(name, this);
    }

    @Override
    public Map<String, ASTNode> getChildren() {
        Map<String, ASTNode> children = new HashMap<>();
        children.put("body", body);
        return children;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        FunctionNode that = (FunctionNode) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, body);
    }
    
}
