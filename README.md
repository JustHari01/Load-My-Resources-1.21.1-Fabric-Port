# Load My Resources (UNOFFICIAL) — Fabric 1.21.1

An unofficial Fabric 1.21.1 compatibility port of **Load My Resources** by Keksuccino.
The port starts from upstream version 1.0.4 on the `fabric-1.20.2` branch at commit
[`f8eeba923c532f5aa6be226501bf1c7fd1fb5fa7`](https://github.com/Keksuccino/Load-My-Resources/commit/f8eeba923c532f5aa6be226501bf1c7fd1fb5fa7)
and updates the Minecraft/Fabric build setup and resource-pack API integration.

## What it does

The mod loads resources from a folder as a hidden client resource pack, so you can
override assets without making and enabling a separate pack. By default it reads the
`resources/` folder in the Minecraft game directory. The folder contents use resource
namespaces directly, such as `resources/minecraft/textures/...`.

The source setting is `resource_path` in
`config/loadmyresources/config.cfg`. Its default value is `resources/`.

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.16.14 or newer
- Fabric API 0.116.17+1.21.1
- Java 21

This is a client-side mod. It has been compiled with `remapJar`; in-game behavior has
not yet been verified in a Minecraft client.

## Attribution and license

The original mod and source are by [Keksuccino](https://github.com/Keksuccino/Load-My-Resources).
This port is not an official release and is not affiliated with the original author.
The upstream GPL-3.0 license is retained in [`LICENSE`](LICENSE).

AI disclosure: AI tools assisted with the Minecraft 1.21.1 API migration and release
documentation. The port is based on the original GPL-licensed source, and the release
was compiled locally.
