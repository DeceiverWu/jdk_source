// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.verifier.VerifierAnnotationProcessor, org.graalvm.compiler.replacements.verifier.PluginGenerator
package org.graalvm.compiler.nodes;

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
public class PluginFactory_PiArrayNode implements NodeIntrinsicPluginFactory {

    //        class: org.graalvm.compiler.nodes.PiArrayNode
    //       method: piArrayCastToSnippetReplaceeStamp(java.lang.Object,int)
    // generated-by: org.graalvm.compiler.replacements.verifier.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
    private static final class PiArrayNode_piArrayCastToSnippetReplaceeStamp extends GeneratedInvocationPlugin {

        @Override
        public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
            ValueNode arg0 = args[0];
            ValueNode arg1 = args[1];
            org.graalvm.compiler.nodes.PiArrayNode.Placeholder node = new org.graalvm.compiler.nodes.PiArrayNode.Placeholder(arg0, arg1);
            b.addPush(JavaKind.Object, node);
            return true;
        }
    }

    @Override
    public void registerPlugins(InvocationPlugins plugins, InjectionProvider injection) {
        plugins.register(new PiArrayNode_piArrayCastToSnippetReplaceeStamp(), org.graalvm.compiler.nodes.PiArrayNode.class, "piArrayCastToSnippetReplaceeStamp", java.lang.Object.class, int.class);
    }
}
