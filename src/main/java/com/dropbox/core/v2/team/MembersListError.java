/* DO NOT EDIT */
/* This file was generated from team_members.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public enum MembersListError {
    // union MembersListError
    /**
     * An unspecified error.
     */
    OTHER; // *catch_all

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<MembersListError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MembersListError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                default: {
                    g.writeString("other");
                }
            }
        }

        @Override
        public MembersListError deserialize(JsonParser p) throws IOException, JsonParseException {
            MembersListError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else {
                value = MembersListError.OTHER;
                skipFields(p);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
