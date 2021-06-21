package com.taskagile.app.domain.common.mail;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@EqualsAndHashCode @ToString
@AllArgsConstructor
public class MessageVariable {
  private String key;
  private Object value;

  public static MessageVariable from(String key, Object value) {
    return new MessageVariable(key, value);
  }
}
