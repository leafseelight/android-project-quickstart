<?xml version="1.0"?>
<recipe>
<#if needActivity>
    <merge from="root/AndroidManifest.xml.ftl"
           to="${escapeXmlAttribute(manifestOut)}/AndroidManifest.xml" />
</#if>

<#if needActivity && generateActivityLayout>
    <instantiate from="root/res/layout/simple.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/${activityLayoutName}.xml" />
</#if>

<#if needFragment && generateFragmentLayout>
    <instantiate from="root/res/layout/simple.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/${fragmentLayoutName}.xml" />
</#if>


<#if needActivity>
    <instantiate from="root/src/app_package/ArmsActivity.${ktOrJavaExt}.ftl"
                   to="${projectOut}/src/main/java/${slashedPackageName(ativityPackageName)}/${pageName}Activity.${ktOrJavaExt}" />
    <open file="${projectOut}/src/main/java/${slashedPackageName(ativityPackageName)}/${pageName}Activity.${ktOrJavaExt}" />
</#if>

<#if needFragment>
    <instantiate from="root/src/app_package/ArmsFragment.${ktOrJavaExt}.ftl"
                   to="${projectOut}/src/main/java/${slashedPackageName(fragmentPackageName)}/${pageName}Fragment.${ktOrJavaExt}" />
    <open file="${projectOut}/src/main/java/${slashedPackageName(fragmentPackageName)}/${pageName}Fragment.${ktOrJavaExt}" />
</#if>

<#if needContract>
    <instantiate from="root/src/app_package/ArmsContract.${ktOrJavaExt}.ftl"
                   to="${projectOut}/src/main/java/${slashedPackageName(contractPackageName)}/${pageName}Contract.${ktOrJavaExt}" />
</#if>

<#if needPresenter>
    <instantiate from="root/src/app_package/ArmsPresenter.${ktOrJavaExt}.ftl"
                   to="${projectOut}/src/main/java/${slashedPackageName(presenterPackageName)}/${pageName}Presenter.${ktOrJavaExt}" />
    <open file="${projectOut}/src/main/java/${slashedPackageName(presenterPackageName)}/${pageName}Presenter.${ktOrJavaExt}" />
</#if>


</recipe>
