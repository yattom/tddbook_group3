{ pkgs }: {
    deps = [
        pkgs.vimHugeX
        pkgs.maven
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}