package arathain.amogus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.UUID;

public class EliminatePlayers implements ModInitializer {
	public static final ArrayList<UUID> bannedUuids = new ArrayList<>();

	@Override
	public void onInitialize(ModContainer mod) {
		bannedUuids.add(UUID.fromString("69de1deb-2675-4deb-879b-bcc6bc090829"));
	}
}
