/* Generated By:JJTree: Do not edit this line. ASTtypereference.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTtypereference extends SimpleNode {
  public ASTtypereference(int id) {
    super(id);
  }

  public ASTtypereference(AsnParser p, int id) {
    super(p, id);
  }


    public String
    toString()
    {
        return new String("typereference: " + jjtGetFirstToken().image);
    }

    public String
    getClassName()
    {
        return jjtGetFirstToken().image;
    }

  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fbd7cdec59c0f23719c119368101ba49 (do not edit this line) */