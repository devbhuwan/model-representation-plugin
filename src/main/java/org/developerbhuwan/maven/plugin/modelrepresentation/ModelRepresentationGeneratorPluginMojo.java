package org.developerbhuwan.maven.plugin.modelrepresentation;

import org.apache.maven.plugins.annotations.Mojo;
import org.developerbhuwan.maven.core.AbstractPluginMojo;

import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_SOURCES;
import static org.apache.maven.plugins.annotations.ResolutionScope.TEST;

/**
 * @author Bhuwan Prasad Upadhyay
 */
@Mojo(name = "generate-java", defaultPhase = GENERATE_SOURCES, requiresDependencyResolution = TEST, requiresDependencyCollection = TEST, threadSafe = true)
public class ModelRepresentationGeneratorPluginMojo extends AbstractPluginMojo {

    @Override
    protected void doExecute() {

    }

}
