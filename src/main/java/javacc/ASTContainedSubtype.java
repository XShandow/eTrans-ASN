/* Generated By:JJTree: Do not edit this line. ASTContainedSubtype.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public
class ASTContainedSubtype extends SimpleNode {
  public ASTContainedSubtype(int id) {
    super(id);
  }

  public ASTContainedSubtype(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e0fdf96be45020875d54837b78318b5a (do not edit this line) */
