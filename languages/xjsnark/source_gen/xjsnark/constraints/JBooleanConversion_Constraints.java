package xjsnark.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SNodePointer;

public class JBooleanConversion_Constraints extends BaseConstraintsDescriptor {
  public JBooleanConversion_Constraints() {
    super(MetaIdFactory.conceptId(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x26b0c1978f544467L));
  }
  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }
  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }
  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c116dbe1L, "xjsnark.structure.VerifyStatement")) || SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x73bec06cafa7537cL, "xjsnark.structure.VerifyEqStatement"))) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"))) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x12cb358a1aa7c343L, "xjsnark.structure.BoundedLoop"))) {
      return true;
    }


    return !(SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"))) && !(SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList")));
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:bae2f377-1730-4c40-8a68-cde7bdcf162d(xjsnark.constraints)", "2787941026031226811");
}
