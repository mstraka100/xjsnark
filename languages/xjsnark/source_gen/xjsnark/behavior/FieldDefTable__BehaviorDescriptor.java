package xjsnark.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.math.BigInteger;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class FieldDefTable__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, "xjsnark.structure.FieldDefTable");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String[]> getIds_id6zlb0z1MnE_ = new SMethodBuilder<String[]>(new SJavaCompoundTypeImpl(String[].class)).name("getIds").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6zlb0z1MnE_").registry(REGISTRY).build();
  public static final SMethod<BigInteger> getVal_id6zlb0z1Mxih = new SMethodBuilder<BigInteger>(new SJavaCompoundTypeImpl(BigInteger.class)).name("getVal").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6zlb0z1Mxih").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(String.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getIds_id6zlb0z1MnE_, getVal_id6zlb0z1Mxih);

  private static void ___init___(@NotNull SNode __thisNode__) {
    SNode n = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, "xjsnark.structure.FieldRecord")));
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, 0x68d52c08c1c969a4L, "prime"), "21888242871839275222246405745257275088548364400416034343698204186575808495617");
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "p");
    ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))).addElement(n);
    n = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, "xjsnark.structure.FieldRecord")));
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, 0x68d52c08c1c969a4L, "prime"), "257");
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "swifft");
    ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))).addElement(n);
    n = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, "xjsnark.structure.FieldRecord")));
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad2L, 0x68d52c08c1c969a4L, "prime"), "115792089210356248762697446949407573530086143415290314195533631308867097853951");
    SPropertyOperations.set(n, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "p256");
    ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))).addElement(n);


  }

  /*package*/ static String[] getIds_id6zlb0z1MnE_(@NotNull SNode __thisNode__) {
    String[] result = new String[ListSequence.fromList(SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))).count()];
    int i = 0;
    for (SNode node : SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))) {
      result[i++] = SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    }
    return result;
  }
  /*package*/ static BigInteger getVal_id6zlb0z1Mxih(@NotNull SNode __thisNode__, String id) {
    for (SNode node : SLinkOperations.getChildren(__thisNode__, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c1c95ad1L, 0x68d52c08c1c97a9fL, "fieldDefinitions"))) {
      if (SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).equals("id")) {
        return FieldRecord__BehaviorDescriptor.getValue_id6zlb0z1MmQE.invoke(node);
      }
    }
    return null;
  }

  /*package*/ FieldDefTable__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String[]) getIds_id6zlb0z1MnE_(node));
      case 1:
        return (T) ((BigInteger) getVal_id6zlb0z1Mxih(node, (String) parameters[0]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
