package com.byelink.web.model.imp;

import com.byelink.web.model.IModelAppender;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

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


    }
}
