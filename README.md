# graalvm-demo
Download graalvm community version from https://github.com/oracle/graal/releases, set GRAALVM path in /etc/environment and also add GRAALVM/bin in path
<br>
Please make sure no other java included in path

To generate a native image of your jar, install the following if these not installed  
<ul>
<li>sudo apt install gcc</li>
<li>sudo apt install libz-dev</li>
</ul>

Now execute buildNativeImage.sh to generate native file for your java project