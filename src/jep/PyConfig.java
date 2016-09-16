/**
 * Copyright (c) 2016 JEP AUTHORS.
 *
 * This file is licensed under the the zlib/libpng License.
 *
 * This software is provided 'as-is', without any express or implied
 * warranty. In no event will the authors be held liable for any
 * damages arising from the use of this software.
 * 
 * Permission is granted to anyone to use this software for any
 * purpose, including commercial applications, and to alter it and
 * redistribute it freely, subject to the following restrictions:
 * 
 *     1. The origin of this software must not be misrepresented; you
 *     must not claim that you wrote the original software. If you use
 *     this software in a product, an acknowledgment in the product
 *     documentation would be appreciated but is not required.
 * 
 *     2. Altered source versions must be plainly marked as such, and
 *     must not be misrepresented as being the original software.
 * 
 *     3. This notice may not be removed or altered from any source
 *     distribution.
 */
package jep;

/**
 * <p>
 * A configuration object for setting Python pre-initialization parameters.
 * </p>
 * 
 * @author Jeff V Stein
 */
public class PyConfig {

    protected int noSiteFlag = -1;

    protected int noUserSiteDirectory = -1;

    protected int ignoreEnvironmentFlag = -1;

    protected int verboseFlag = -1;

    protected int optimizeFlag = -1;

    protected int dontWriteBytecodeFlag = -1;

    protected int hashRandomizationFlag = -1;

    /**
     * Set the Py_NoSiteFlag variable on the python interpreter. This
     * corresponds to the python "-S" flag and will prevent the "site" module
     * from being automatically loaded.
     * 
     * @param noSiteFlag
     *            value to pass to Python for Py_NoSiteFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setNoSiteFlag(int noSiteFlag) {
        this.noSiteFlag = noSiteFlag;
        return this;
    }

    /**
     * Set the Py_NoUserSiteDirectory variable on the python interpreter. This
     * corresponds to the python "-s" flag and will prevent the user's local
     * python site directory from being added to sys.path.
     * 
     * @param noUserSiteDirectory
     *            value to pass to Python for Py_NoUserSiteDirectory
     * @return a reference to this PyConfig
     */
    public PyConfig setNoUserSiteDirectory(int noUserSiteDirectory) {
        this.noUserSiteDirectory = noUserSiteDirectory;
        return this;
    }

    /**
     * Set the Py_IgnoreEnvironmentFlag variable on the python interpreter. This
     * corresponds to the python "-E" flag and will instruct python to ignore
     * all PYTHON* environment variables (e.g. PYTHONPATH).
     * 
     * @param ignoreEnvironmentFlag
     *            value to pass to Python for Py_IgnoreEnvironmentFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setIgnoreEnvironmentFlag(int ignoreEnvironmentFlag) {
        this.ignoreEnvironmentFlag = ignoreEnvironmentFlag;
        return this;
    }

    /**
     * Set the Py_VerboseFlag variable on the python interpreter. This
     * corresponds to the python "-v" flag and will increase verbosity, in
     * particular tracing import statements.
     * 
     * @param verboseFlag
     *            value to pass to Python for Py_VerboseFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setVerboseFlag(int verboseFlag) {
        this.verboseFlag = verboseFlag;
        return this;
    }

    /**
     * Set the Py_OptimizeFlag variable on the python interpreter. This
     * corresponds to the python "-O" flag and will slightly optimize the
     * generated bytecode.
     * 
     * @param optimizeFlag
     *            value to pass to Python for Py_OptimizeFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setOptimizeFlag(int optimizeFlag) {
        this.optimizeFlag = optimizeFlag;
        return this;
    }

    /**
     * Set the Py_DontWriteBytecodeFlag variable on the python interpreter. This
     * corresponds to the python "-B" flag and will instruct python to not write
     * .py[co] files on import.
     * 
     * @param dontWriteBytecodeFlag
     *            value to pass to Python for Py_DontWriteBytecodeFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setDontWriteBytecodeFlag(int dontWriteBytecodeFlag) {
        this.dontWriteBytecodeFlag = dontWriteBytecodeFlag;
        return this;
    }

    /**
     * Set the Py_HashRandomizationFlag variable on the python interpreter. This
     * corresponds to the environment variable PYTHONHASHSEED.
     * 
     * @param hashRandomizationFlag
     *            value to pass to Python for Py_HashRandomizationFlag
     * @return a reference to this PyConfig
     */
    public PyConfig setHashRandomizationFlag(int hashRandomizationFlag) {
        this.hashRandomizationFlag = hashRandomizationFlag;
        return this;
    }

}
