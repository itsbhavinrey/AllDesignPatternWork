package net.media.training.designpattern.builder;
import java.util.*;
public class XMLBuilder {
    private StringBuilder xml;

    public XMLBuilder(String xmlVersion) {
        xml = new StringBuilder(xmlVersion);
    }

    public XMLBuilder startTag(String name) {
        xml.append("<").append(name).append(">");
        return this;
    }

    public XMLBuilder addAttribute(String name, String value) {
        xml.append(" ").append(name).append("=\"").append(value).append("\"");
        return this;
    }

    public XMLBuilder addText(String text) {
        xml.append(text);
        return this;
    }

    public XMLBuilder endTag() {
        xml.append("</").append(getCurrentElementName()).append(">");
        return this;
    }

    private String getCurrentElementName() {
        int lastStartTagIndex = xml.lastIndexOf("<");
        int lastEndTagIndex = xml.lastIndexOf(">");
        return xml.substring(lastStartTagIndex + 1, lastEndTagIndex);
    }

    @Override
    public String toString() {
        return xml.toString();
    }
}