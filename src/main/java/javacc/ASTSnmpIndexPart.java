/* Generated By:JJTree: Do not edit this line. ASTSnmpIndexPart.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTSnmpIndexPart extends SimpleNode {
  public ASTSnmpIndexPart(int id) {
    super(id);
  }

  public ASTSnmpIndexPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=aee6cbfae00c64b9384ac6238c0280ae (do not edit this line) */
