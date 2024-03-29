package MicroservicesArchitectureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_MicroserviceType extends EnumerationDescriptorBase {

  public EnumerationDescriptor_MicroserviceType() {
    super(0x3d827bac02154a87L, 0x8b1c1ab047e79a3bL, 0x2e2e087c4bdeb13cL, "MicroserviceType", "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227708");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_Internal_0 = new EnumerationDescriptor.MemberDescriptor("Internal", "Internal", 0x2e2e087c4bdeb13dL, "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227709");
  private final EnumerationDescriptor.MemberDescriptor myMember_External_0 = new EnumerationDescriptor.MemberDescriptor("External", "External", 0x2e2e087c4bdeb13eL, "r:48771403-405a-41ee-a755-08578f66c616(MicroservicesArchitectureLanguage.structure)/3327606504615227710");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x3d827bac02154a87L, 0x8b1c1ab047e79a3bL, 0x2e2e087c4bdeb13cL, 0x2e2e087c4bdeb13dL, 0x2e2e087c4bdeb13eL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_Internal_0, myMember_External_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_Internal_0;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "Internal":
        return myMember_Internal_0;
      case "External":
        return myMember_External_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
