// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.verifier.VerifierAnnotationProcessor, org.graalvm.compiler.replacements.verifier.PluginGenerator
package org.graalvm.compiler.hotspot.nodes;

import jdk.vm.ci.meta.ResolvedJavaMethod;
import org.graalvm.compiler.serviceprovider.ServiceProvider;

import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.graphbuilderconf.GraphBuilderContext;
import org.graalvm.compiler.nodes.graphbuilderconf.GeneratedInvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.graalvm.compiler.nodes.graphbuilderconf.NodeIntrinsicPluginFactory;

import jdk.vm.ci.meta.JavaKind;

@ServiceProvider(NodeIntrinsicPluginFactory.class)
public class PluginFactory_AllocaNode implements NodeIntrinsicPluginFactory {

    //        class: org.graalvm.compiler.hotspot.nodes.AllocaNode
    //       method: alloca(int)
    // generated-by: org.graalvm.compiler.replacements.verifier.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
    private static final class AllocaNode_alloca extends GeneratedInvocationPlugin {

        @Override
        public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
            org.graalvm.compiler.word.WordTypes arg0 = injectedWordTypes;
            int arg1;
            if (args[0].isConstant()) {
                arg1 = args[0].asJavaConstant().asInt();
            } else {
                return false;
            }
            org.graalvm.compiler.hotspot.nodes.AllocaNode node = new org.graalvm.compiler.hotspot.nodes.AllocaNode(arg0, arg1);
            b.addPush(JavaKind.Object, node);
            return true;
        }

        private final org.graalvm.compiler.word.WordTypes injectedWordTypes;

        private AllocaNode_alloca(InjectionProvider injection) {
            this.injectedWordTypes = injection.getInjectedArgument(org.graalvm.compiler.word.WordTypes.class);
        }
    }

    @Override
    public void registerPlugins(InvocationPlugins plugins, InjectionProvider injection) {
        plugins.register(new AllocaNode_alloca(injection), org.graalvm.compiler.hotspot.nodes.AllocaNode.class, "alloca", int.class);
    }
}
