/* Generated By:JJTree: Do not edit this line. ASTTag.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package javacc;

public class ASTTag extends SimpleNode {

	public int
	getTagNumber()
	{
		int numChildren = jjtGetNumChildren();
		for(int i = 0; i < numChildren; i++)
		{
			SimpleNode n = (SimpleNode)jjtGetChild(i);
			if(n instanceof ASTClassNumber)
				return ((ASTClassNumber)n).getTagNumber();
		}

		return -1;
	}

	public int
	getTagClass()
	{
		int numChildren = jjtGetNumChildren();
		for(int i = 0; i < numChildren; i++)
		{
			SimpleNode n = (SimpleNode)jjtGetChild(i);
			if(n instanceof ASTClass)
				return ((ASTClass)n).getTagClass();
		}

		return ASTTaggedType.CONTEXT;
	}

  public ASTTag(int id) {
    super(id);
  }

  public ASTTag(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4bdc3afce47bf7d2f6e15c529a90ec8d (do not edit this line) */
