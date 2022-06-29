package org.myddd.dubbo;

import com.salesforce.jprotoc.ProtocPlugin;

public class Dubbo3Generator extends AbstractGenerator {

    public static void main(String[] args) {
        if (args.length == 0) {
            ProtocPlugin.generate(new Dubbo3Generator());
        } else {
            ProtocPlugin.debug(new Dubbo3Generator(), args[0]);
        }
    }

    @Override
    protected String getClassPrefix() {
        return "";
    }

    @Override
    protected String getClassSuffix() {
        return "Dubbo";
    }

    @Override
    protected String getTemplateFileName () {
        return "Dubbo3Stub.mustache";
    }

    @Override
    protected String getInterfaceTemplateFileName () {
        return "Dubbo3InterfaceStub.mustache";
    }


    @Override
    protected String getSingleTemplateFileName() {
        return "DubboStub3Single.mustache";
    }

    @Override
    protected boolean enableMultipleTemplateFiles() {
        return true;
    }
}