package com.example.reactiveprogramming.apiresponse;

import javax.swing.Spring;

public class SpringHierarchy {


//     Alright 👍 let’s break it down step by step, in simple terms but more detail:

// 1. IoC (Inversion of Control)

// Normally, in Java, you create objects using new.

// With IoC, Spring takes control: it creates, wires, and manages your objects (beans).

// This reduces tight coupling between classes.

// 2. Bean & Bean Scope

// A bean = just a Java object managed by Spring.

// Bean Scope = how Spring decides the lifetime/visibility of that bean:

// singleton → one instance per container.

// prototype → new instance every time you ask.

// request, session, application → web-specific scopes.

// 3. Spring Container

// The container is the "box" that follows IoC and manages beans.

// Types:

// BeanFactory → basic container (just creates and wires beans).

// ApplicationContext → advanced container (adds events, i18n, AOP, enterprise features).

// 4. Spring Context

// ApplicationContext is what we usually mean by Spring Context.

// It is a specialized Spring Container with more power than BeanFactory.

// Example: AnnotationConfigApplicationContext, ClassPathXmlApplicationContext.

// 🔗 Hierarchy / Relationship

// IoC principle → implemented by Spring Container (BeanFactory, ApplicationContext).

// ApplicationContext (Spring Context) → is the commonly used container, sitting on top of BeanFactory.

// Beans inside the container → managed according to their scope.

// 👉 In simple hierarchy form:

// IoC (concept)
//    ↓
// Spring Container (implementation of IoC)
//    ↓
// ApplicationContext (advanced Spring Container)
//    ↓
// Beans (managed with defined scopes)


// Would you like me to also give a real-world analogy (like a factory + workers example) to connect these concepts to daily life?

}
