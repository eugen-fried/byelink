package com.byelink.web.model.imp;

import com.byelink.web.model.IModelAppender;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * User: User
 * Date: 08/03/13
 * Time: 20:35
 */
@Scope("prototype")
@Component("settingsModelAppender")
public class SettingsModelAppenderImp implements IModelAppender {

    @Override
    public void append(Model model) {

        List<String> languages = createMockLanguages();
        List<String> locations = createMockLocations();
        List<String> categories = createMockCategories();

        model.addAttribute("languages", languages);
        model.addAttribute("locations", locations);
        model.addAttribute("categories", categories);
    }

    private List<String> createMockCategories() {
        List<String> categories = new ArrayList<String>();

        categories.add("-- Business & Services --");
        categories.add("Advertising & Marketing");
        categories.add("Community & Education");
        categories.add("Computing & Apps");
        categories.add("Consulting & Coaching");
        categories.add("Finance & Law");
        categories.add("Health & Beauty");
        categories.add("Home & Garden");
        categories.add("Maintenance Services");
        categories.add("Real Estate & Property");
        categories.add("Religion & Non Profit");
        categories.add("Sports & Games");
        categories.add("Vet & Pets");
        categories.add("Weddings & Events");

        categories.add("-- Restaurant & Hospitality --");
        categories.add("Bar & Club");
        categories.add("Cafe & Restaurant");
        categories.add("Catering & Entertaining");
        categories.add("Food & Drink");
        categories.add("Hotel & Travel");

        categories.add("-- Music & Entertainment --");
        categories.add("Actors & Theater");
        categories.add("Bands & Singer");
        categories.add("Dance");
        categories.add("Event Production");
        categories.add("Film");
        categories.add("Musician");
        categories.add("Nightlife");
        categories.add("Performing Arts");

        categories.add("-- Retail & Fashion --");
        categories.add("Accessories & Jewelry");
        categories.add("Clothing");
        categories.add("Electronics");
        categories.add("Hair & Beauty");
        categories.add("Model");
        categories.add("Other");
        categories.add("Stylish");

        categories.add("-- Photography --");
        categories.add("Event Photographer");
        categories.add("Pro Photographer");
        categories.add("Sport Photographer");
        categories.add("Travel Photographer");
        categories.add("Wedding Photographer");

        /**
         <option style="font-weight:bold;color:black" disabled="disabled">-- Retail & Fashion --</option>
         <option style="margin-left:10px;" value="30">Accessories & Jewelry</option>
         <option style="margin-left:10px;" value="31">Clothing</option>
         <option style="margin-left:10px;" value="32">Electronics</option>
         <option style="margin-left:10px;" value="33">Hair & Beauty</option>
         <option style="margin-left:10px;" value="34">Model</option>
         <option style="margin-left:10px;" value="35">Other</option>
         <option style="margin-left:10px;" value="36">Stylist</option>
         <option style="font-weight:bold;color:black" disabled="disabled">-- Photography --</option>
         <option style="margin-left:10px;" value="37">Event Photographer</option>
         <option style="margin-left:10px;" value="38">Pro Photographer</option>
         <option style="margin-left:10px;" value="39">Sport Photographer</option>
         <option style="margin-left:10px;" value="40">Travel Photographer</option>
         <option style="margin-left:10px;" value="41">Wedding Photographer</option>
         <option style="font-weight:bold;color:black" disabled="disabled">-- Creative Arts --</option>
         <option style="margin-left:10px;" value="42">Actors & Theater</option>
         <option style="margin-left:10px;" value="43">Artist</option>
         <option style="margin-left:10px;" value="44">Author & Writer</option>
         <option style="margin-left:10px;" value="45">Other</option>
         <option style="margin-left:10px;" value="46">Painter & Illustrator</option>
         <option style="margin-left:10px;" value="47">Performing Arts</option>
         <option style="margin-left:10px;" value="48">Portfolio</option>
         <option style="font-weight:bold;color:black" disabled="disabled">-- Design --</option>
         <option style="margin-left:10px;" value="49">Architect & Interiors</option>
         <option style="margin-left:10px;" value="50">Design Agency</option>
         <option style="margin-left:10px;" value="51">Designer</option>
         <option style="margin-left:10px;" value="52">Fashion Designer</option>
         <option style="margin-left:10px;" value="53">Other</option>
         <option style="margin-left:10px;" value="54">Portfolio</option>
         <option style="margin-left:10px;" value="55">Web Designer</option>
         <option style="font-weight:bold;color:black" disabled="disabled">-- Personal --</option>
         <option style="margin-left:10px;" value="56">1 Pager</option>
         <option style="margin-left:10px;" value="57">Kids</option>
         <option style="margin-left:10px;" value="58">Portfolio</option>
         <option style="margin-left:10px;" value="59">Resume & CV</option>
         <option style="margin-left:10px;" value="60">Weddings & Engagement</option>
         */

        return categories;  //To change body of created methods use File | Settings | File Templates.
    }

    private List<String> createMockLocations() {
        List<String> locations = new ArrayList<String>();

        locations.add("Germany");
        locations.add("Israel");
        locations.add("Gay land");

        return locations;  //To change body of created methods use File | Settings | File Templates.
    }

    private List<String> createMockLanguages() {
        List<String> languages = new ArrayList<String>();

        languages.add("English");
        languages.add("Hebrew");
        languages.add("Gayish");
        languages.add("Shpretzel");

        return languages;  //To change body of created methods use File | Settings | File Templates.
    }


}
