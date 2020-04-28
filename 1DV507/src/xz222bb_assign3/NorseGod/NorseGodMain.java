package xz222bb_assign3.NorseGod;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;

public class NorseGodMain extends Application {
    private ArrayList<NorseGod> norseGods = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {

        norseGods.add(new NorseGod("Odin", "Æsir", "Old Norse texts portray Odin as one-eyed and long-bearded, frequently wielding a spear named Gungnir and wearing a cloak and a broad hat. He is often accompanied by his animal companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé. Odin is attested as having many sons, most famously the gods Thor (with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts he frequently seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), makes wagers with his wife Frigg over the outcome of exploits, and takes part both in the creation of the world by way of slaying the primordial being Ymir and in giving the gift of life to the first two humans Ask and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes and poetry is also attributed to him, giving Odin aspects of the culture hero.\n" +
                "\nOld Norse texts associate female beings connected with the battlefield—the valkyries—with the god, and Odin oversees Valhalla, where he receives half of those who die in battle, the einherjar. The other half are chosen by the goddess Freyja for her afterlife-location, Fólkvangr. Odin consults the disembodied, herb-embalmed head of the wise being Mímir for advice, and during the foretold events of Ragnarök Odin is told to lead the einherjar into battle before being consumed by the monstrous wolf Fenrir. In later folklore Odin appears as a leader of the Wild Hunt, a ghostly procession of the dead through the winter sky. He is associated with charms and other forms of magic, particularly in Old English and Old Norse texts."));
        norseGods.add(new NorseGod("Thor", "Æsir", "Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded. With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology."));
        norseGods.add(new NorseGod("Loki", "Æsir", "Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr and the two will slay each other."));
        norseGods.add(new NorseGod("Frigg", "Ásynjur", "Frigg is described as a goddess associated with foresight and wisdom in Norse mythology, the northernmost branch of Germanic mythology and most extensively attested. Frigg is the wife of the major god Odin and dwells in the wetland halls of Fensalir, is famous for her foreknowledge, is associated with the goddesses Fulla, Lofn, Hlín, and Gná, and is ambiguously associated with the Earth, otherwise personified as an apparently separate entity Jörð (Old Norse \"Earth\"). The children of Frigg and Odin include the gleaming god Baldr. Due to significant thematic overlap, scholars have proposed a connection to the goddess Freyja."));
        norseGods.add(new NorseGod("Freyja", "Vanir", "Freyja rules over her heavenly field, Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís."));
        norseGods.add(new NorseGod("Ymir", "Jötunn(Giant)", "In Norse mythology, Ymir is the ancestor of all jötnar. Ymir is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material, in the Prose Edda, written by Snorri Sturluson in the 13th century, and in the poetry of skalds. Taken together, several stanzas from four poems collected in the Poetic Edda refer to Ymir as a primeval being who was born from venom that dripped from the icy rivers Élivágar and lived in the grassless void of Ginnungagap. Ymir birthed a male and female from the pits of his arms, and his legs together begat a six-headed being. The gods Odin, Vili and Vé fashioned the Earth (elsewhere personified as a goddess; Jörð) from his flesh, from his blood the ocean, from his bones the mountains, from his hair the trees, from his brains the clouds, from his skull the heavens, and from his eyebrows the middle realm in which mankind lives, Midgard. In addition, one stanza relates that the dwarfs were given life by the gods from Ymir's flesh and blood (or the Earth and sea)."));
        norseGods.add(new NorseGod("Alvíss", "Dwarfs", "Thor's daughter, Þrúðr, was promised in marriage to Alvíss. Thor was unhappy with the match however, so he devised a plan. He told Alvíss that, because of his small height, he had to prove his wisdom. Alvíss agreed, but Thor made his tests last until dawn, when Alviss, because he was a dwarf, was turned to stone on being exposed to the sunlight."));
        norseGods.add(new NorseGod("Egil", "Heroes", "The Proto-Germanic form of the legend may only be guessed at, but it appears likely that Egil was a renowned archer who defended a keep together with his wife Aliruna, against numerous attackers. The testimony of the Pforzen buckle is uncertain beyond naming Aigil and Ailrun, possibly adding that they fought a battle at the Ilz river. Similar to Heracles and Athena fighting off the giants from Olympus in the Gigantomachy the Franks Casket shows the scene of Aegil and his wife enclosed in the keep, with Aegil shooting arrows against attacking troops of giants."));

        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10,10,10,10));

        Label label = new Label("Norse Gods and other Beings");
        label.setFont(Font.font("Tahoma", FontWeight.BOLD,25));
        borderPane.setTop(label);

        ListView<String> godsProfile = new ListView<>();
        godsProfile.setPrefWidth(100);
        for (NorseGod god : norseGods) {
            godsProfile.getItems().add(god.getName());
        }
        borderPane.setLeft(godsProfile);

        Text name = new Text();
        name.setFont(Font.font("Tahoma", FontWeight.BOLD,15));
        Text race = new Text();
        Text desc = new Text();


        TextFlow textFlow = new TextFlow(name, race, desc);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textFlow);
        scrollPane.setFitToWidth(true);
        scrollPane.setPadding(new Insets(5, 5, 5, 5));
        borderPane.setCenter(scrollPane);

        godsProfile.getSelectionModel().selectedIndexProperty().addListener(e -> {
            name.setText(norseGods.get(godsProfile.getSelectionModel().getSelectedIndex()).getName() + "\n");
            race.setText(norseGods.get(godsProfile.getSelectionModel().getSelectedIndex()).getRace() + "\n\n");
            desc.setText(norseGods.get(godsProfile.getSelectionModel().getSelectedIndex()).getDesc());
        });

        Scene scene = new Scene(borderPane, 500, 300);
        stage.setTitle("Norse Gods");
        stage.setScene(scene);
        stage.show();
    }
}
