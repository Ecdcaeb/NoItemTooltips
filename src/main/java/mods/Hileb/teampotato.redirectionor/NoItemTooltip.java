package mods.Hileb.noitemtooltip;

import nilloader.api.ClassTransformer;
import nilloader.api.ModRemapper;
import nilloader.api.NilLogger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

import java.util.ListIterator;

// All entrypoint classes must implement Runnable.
public class NoItemTooltip implements Runnable {

    public static final NilLogger LOGGER = NilLogger.get("NoItemTooltip");

    @Override
	public void run() {
		// You can change your desired mapping here. Setting it to "default" doesn't accomplish
		// anything, but it's here for illustration.
		ModRemapper.setTargetMapping("default");
		
		// Any class transformers need to be registered with NilLoader like this.
		//ClassTransformer.register(this);
	}
}
