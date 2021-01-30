# HippodromeTests
A project ready to be scanned for Hippodrome patches.

## Run Hippodrome from IntelliJ
### Run Everything and Automatically Apply Patches

In IntelliJ's run configuration options, choose "HippodromeBenchmark" and run.

This will run Hippodrome for all the benchmarks in `src/main/java` and automatically apply the most fitting patches. Original, unpatched files will be stored in the format `<FileName.java.orig>`.

![png of running HippodromeBenchmark configuration](https://imgur.com/NJCYHMS.png)

### Run Individual Benchmarks

In IntelliJ's run configuration options, choose the corresponding benchmark to test. This won't automatically apply the patches and instead lets you view the detected bugs individually and apply the corresponding patches.

This will run Hippodrome for the specific folder in src/main/java, and provide patch options to the user with IntelliJ's Quick Fix system.

#### Viewing Individual Bugs and Applying Patches Manually

To view all the detected bugs, open the "Infer Bug list" window and click to "Sort by file" or "Sort by bugtype". To apply the patches, hover over the corresponding error highlight in the editor and click "More actions..", then choose the corresponding Patch id.


![png of running an individual benchmark and applying a patch](https://imgur.com/cF55GUg.png)

## Setting up Custom Configurations
The Hippodrome run configuration takes 2 arguments:
* `Hippodrome Run Command`: The command used to run the Hippodrome jar.
* `Generated Infer Command`: Automatically generates the required configuration file to run Hippodrome as `CONFIG.json` in the project's root directory.

### Hippodrome Run Command
Usage:
`java -jar <path_to_hippodrome.jar> --config_file=<path_to_config_file> <additional_parameters>`
* <path_to_hippodrome.jar>: In this Docker Image, the jar is available in /Hippodrome-1.0-jar-with-dependencies.jar
* <path_to_config_file>: Relative path from the project's root directory to a json configuration file. If `Generate new CONFIG.json in root directory` is enabled, a CONFIG.json file from the `Generated Infer Command` text box will be generated in the project's root directory.
* <additional_parameters>: 
  * --intellij=true: Disables automatic application of patches. Instead, it stores the patches in infer-out/hippodrome_patches.json to be processed by the plugin.
  
### Generated Infer Command
When enabled, automatically generates the corresponding Infer command as `CONFIG.json` in the project's root directory.

Usage:
`<path_to_infer> --hippodrome-only <additional_flags> run -- <target_options>`

Example : `infer --hippodrome-only --starvation run -- gradle build`

Produces: 
```json
{
 "infer":"infer",
 "options":["--hippodrome-only", "--starvation"],
 "json_path": "./infer-out/",
 "target_options": ["--", "gradle", "build"],
 "prio_files": [],
 "iterations": 5
}
```
Note: "prio_files" is automatically set to empty, and "iterations" is automatically set to 5.


![image of run configuration options](https://imgur.com/VvAvo6L.png)

## Run Hippodrome from the command line
